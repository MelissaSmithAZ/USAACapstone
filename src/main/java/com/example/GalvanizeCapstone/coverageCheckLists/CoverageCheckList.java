package com.example.GalvanizeCapstone.coverageCheckLists;

import com.example.GalvanizeCapstone.carNotOnPolicyCheckList.CarNotOnPolicyCheckList;
import com.example.GalvanizeCapstone.claims.Claim;
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
    private Boolean carNotOnPolicy;

    @Column
    private Boolean ror;

    @Column
    private Boolean transportation;

    @Column
    private Boolean limits;

    @ManyToOne
    @JoinColumn
    private Member member;

    @OneToOne
    @JoinColumn
    private CarNotOnPolicyCheckList carNotOnPolicyCheckList;

    @OneToOne
    @JoinColumn
    private Claim claim;



    public CoverageCheckList() {}

}
