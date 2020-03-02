package com.example.GalvanizeCapstone.carNotOnPolicyCheckList;

import com.example.GalvanizeCapstone.claims.Claim;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table( name = "carNotOnPolicyCheckList")
@Data
public class CarNotOnPolicyCheckList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column
    private Boolean call_member;

    @Column
    private  String call_doc;


    @Column
    private Boolean rental_agreement;

    @Column
    private Boolean claimant_letter;

    @Column
    private Boolean claimant_call;

    @Column
    private String claimant_call_doc;

    @Column
    private Boolean final_letterMember;

    @Column
    private Boolean coverage_decision;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Claim claim;

    public CarNotOnPolicyCheckList() {}
}
