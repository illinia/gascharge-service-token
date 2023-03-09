package com.gascharge.taemin.service.token;

import com.gascharge.taemin.domain.entity.token.Token;
import com.gascharge.taemin.domain.repository.token.TokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class TokenService {
    private final TokenRepository tokenRepository;

    public List<Token> getTokens() {
        return tokenRepository.findAll();
    }
}
