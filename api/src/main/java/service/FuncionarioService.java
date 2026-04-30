package service;

import dto.FuncionarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import repository.FuncionarioRepository;

import java.util.List;

@Service
public class FuncionarioService{
    @Autowired
    private FuncionarioRepository repository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public List<FuncionarioDTO>list todos()
        return

    public FuncionarioRepository getRepository() {
        return repository
                .finDAll()

    }
}


public class FuncionarioService {
}
