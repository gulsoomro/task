package com.infosecurity.task.repository;

import com.infosecurity.task.model.TorIpsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TorIpRepository extends JpaRepository<TorIpsEntity, Long> {

    TorIpsEntity findAllByIp(String ip);
}
