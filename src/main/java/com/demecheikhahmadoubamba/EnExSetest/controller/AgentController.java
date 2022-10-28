package com.demecheikhahmadoubamba.EnExSetest.controller;

import com.demecheikhahmadoubamba.EnExSetest.entity.Agent;
import com.demecheikhahmadoubamba.EnExSetest.entity.Response;
import com.demecheikhahmadoubamba.EnExSetest.services.AgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "*")
public class AgentController {

    private final AgentService agentService;

    @Autowired
    public AgentController(AgentService agentService){
        this.agentService = agentService;
    }

    @GetMapping("/agents")
    public ResponseEntity<Response> getAgents(){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .results(this.agentService.getAgents())
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .message("Agents retrieved")
                        .build()
        );
    }

    @PostMapping("/agent")
    public ResponseEntity<Response> addAgent(@RequestBody Agent agent){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .results(List.of(this.agentService.addAgent(agent)))
                        .status(HttpStatus.CREATED)
                        .statusCode(HttpStatus.CREATED.value())
                        .message("New Agent created")
                        .build()
        );
    }

    @PutMapping("/{name}")
    public ResponseEntity<Response> updateAgent(@PathVariable String name,@RequestBody Agent agent){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .results(List.of(this.agentService.updateAgent(name,agent)))
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .message("agent updated")
                        .build()
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Response> deleteAgent(@PathVariable Long id){
        return ResponseEntity.ok(
                Response.builder()
                        .timeStamp(LocalDateTime.now())
                        .results(List.of(this.agentService.deleteAgent(id)))
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .message("agent deleted")
                        .build()
        );
    }
}
