package com.example.GalvanizeCapstone.carNotOnPolicyCheckList;

import com.example.GalvanizeCapstone.coverageCheckLists.CoverageCheckList;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table( name = "carNotOnPolicyCheckList")
@Data
public class CarNotOnPolicyCheckList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn
    private CoverageCheckList coverageCheckList;

    @Column
    private Boolean callMember;

    @Column
    private Boolean rentalAgreement;

    @Column
    private Boolean claimant_letter;

    @Column
    private Boolean claimant_call;
    @Column
    private Boolean final_letterMember;

    public CarNotOnPolicyCheckList() {}
}
