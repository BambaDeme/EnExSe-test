package com.demecheikhahmadoubamba.EnExSetest.services;

import com.demecheikhahmadoubamba.EnExSetest.entity.Agent;
import com.demecheikhahmadoubamba.EnExSetest.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class AgentService {

    private final AgentRepository agentRepository;

    @Autowired
    public AgentService(AgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    public List<Agent> getAgents(){
        return this.agentRepository.findAll();
    }

    public Agent addAgent(Agent agent){
        Optional<Agent> optionalAgent = this.agentRepository.findAgentByNameOrIp(agent.getName(), agent.getIp());
        if(optionalAgent.isPresent()){
            throw new IllegalStateException("Agent with given name or ip already exits");
        }
        return this.agentRepository.save(agent);
    }

    @Transactional
    public Agent updateAgent(String name, Agent agent){
        Agent agentToUpdate =  this.agentRepository.findAgentByName(name).orElseThrow(() -> new IllegalStateException("Agent with "+ name + " name does not exist"));

        return this.agentRepository.save(agent);

    }

    public Boolean deleteAgent(Long id) {
        if(!agentRepository.existsById(id)){
            throw new IllegalStateException("Agent with id "+ id +" does not exist");
        }

        agentRepository.deleteById(id);
        return Boolean.TRUE;
    }
}
