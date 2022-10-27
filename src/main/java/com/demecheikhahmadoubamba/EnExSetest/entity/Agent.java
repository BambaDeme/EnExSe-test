package com.demecheikhahmadoubamba.EnExSetest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agent {

    @Id
    @GeneratedValue
    private Long id;

    private String os;

    //@Column(name="lastKeepAlive",nullable = false)
    private Date lastKeepAlive;

    //@Column(name="dateAdd",nullable = false)
    private Date dateAdd;

    private String ip;

    private String name;

    private String version;

    private AgentStatus status;

}
