package br.com.gerenciador.api.service;

import br.com.gerenciador.api.dto.FornecedorRequestDTO;
import br.com.gerenciador.api.dto.FornecedorResponseDTO;
import br.com.gerenciador.api.mapper.EnderecoMapper;
import br.com.gerenciador.api.model.Fornecedor;
import br.com.gerenciador.api.repository.FornecedorRepository;
import br.com.gerenciador.api.mapper.FornecedorMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FornecedorServiceImpl implements FornecedorService {

    private final FornecedorRepository fornecedorRepository;
    private final FornecedorMapper fornecedorMapper;

    private final EnderecoMapper enderecoMapper;

    @Override
    public FornecedorResponseDTO criarFornecedor(FornecedorRequestDTO dto) {

        //Converte o DTO para entidade com Mapper:
        Fornecedor fornecedor = fornecedorMapper.toEntity(dto);

        return fornecedorMapper.toDTO(fornecedorRepository.save(fornecedor));
    }

    @Override
    public List<FornecedorResponseDTO> listarTodosFornecedores() {
        return fornecedorRepository.findAll().stream()
                .map(fornecedorMapper::toDTO)
                .toList();
    }

    @Override
    public FornecedorResponseDTO buscarFornecedorPorId(Long id) {
        Fornecedor fornecedor = fornecedorRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Fornecedor não encontrado"));
        return fornecedorMapper.toDTO(fornecedor);
    }

    @Transactional
    @Override
    public FornecedorResponseDTO atualizarForncedorPeloId(Long id, FornecedorRequestDTO dto) {
        Fornecedor fornecedor = fornecedorRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Fornecedor não encontrado"));
        fornecedor.setNome(dto.nome());
        fornecedor.setCnpj(dto.cnpj());
        fornecedor.setEmail(dto.email());
        fornecedor.setTipoFornecedor(dto.tipoFornecedor());
        fornecedor.setEndereco(enderecoMapper.toEntity(dto.endereco()));

        return fornecedorMapper.toDTO(fornecedorRepository.save(fornecedor));
    }

    @Transactional
    @Override
    public void deletarFornecedorPeloId(Long id) {
        if(!fornecedorRepository.existsById(id)){
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Fornecedor não encontrado");
      }
        fornecedorRepository.deleteById(id);
    }

}
