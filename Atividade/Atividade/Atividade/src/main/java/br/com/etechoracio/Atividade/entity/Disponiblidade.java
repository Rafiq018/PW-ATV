//Rafiq Petelinkar Aboarrage
//Erasmo Alves Costa Neto
package br.com.etechoracio.Atividade.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.dialect.function.TruncFunction;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "TBL_DISPONIBILIDADE")
public class Disponiblidade {

    @Id
    @Column(name = "ID_DISPONIBILIDADE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_DIA_SEMANA")
    private String diaSemana;

    @Column(name = "DT_DAS")
    private LocalDateTime Das;

    @Column(name="DT_ATE")
    private LocalDateTime Ate;


}