package com.example.GalvanizeCapstone.coverageCheckLists;

import com.example.GalvanizeCapstone.claims.Claim;
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
    private Boolean carNotOnPolicy;

    @Column
    private Boolean ror;

    @Column
    private Boolean transportation;

    @Column
    private Boolean limits;

    @OneToOne
    @JoinColumn
    private Claim claim;



    public CoverageCheckList() {}

}
