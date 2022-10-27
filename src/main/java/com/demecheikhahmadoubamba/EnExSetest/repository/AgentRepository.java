package com.demecheikhahmadoubamba.EnExSetest.repository;

import com.demecheikhahmadoubamba.EnExSetest.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AgentRepository extends JpaRepository<Agent,Long> {
    public Optional<Agent> findAgentByNameOrIp(String name, String ip);

    public Optional<Agent> findAgentByName(String name);
}
