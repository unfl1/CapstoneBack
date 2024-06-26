package jiki.jiki.repository;

import jiki.jiki.domain.SiteUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<SiteUser, Long> {
    Optional<SiteUser> findByUsername(String username); //사용자 아이디로 사용자 찾기
    Optional<SiteUser> findByNickname(String nickname); // 닉네임으로 사용자 찾기
}

