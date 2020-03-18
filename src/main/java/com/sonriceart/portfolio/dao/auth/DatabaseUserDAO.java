package com.sonriceart.portfolio.dao.auth;

import com.sonriceart.portfolio.dao.IDAO;
import com.sonriceart.portfolio.model.auth.DatabaseUser;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class DatabaseUserDAO implements IDAO {
    public Optional<DatabaseUser> findDatabaseUserByUsername(String username){
        return Optional.empty();
    }
}
