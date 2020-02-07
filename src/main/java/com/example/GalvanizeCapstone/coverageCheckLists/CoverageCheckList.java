package com.example.GalvanizeCapstone.coverageCheckLists;

import com.example.GalvanizeCapstone.members.Member;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table( name = "coverageCheckList")
@Data

public class CoverageCheckList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String carNotOnPolicy;

    @Column
    private String ror;

    @Column
    private String transportation;

    @Column
    private String limits;

    @ManyToOne
    @JoinColumn
    private Member member;

}
