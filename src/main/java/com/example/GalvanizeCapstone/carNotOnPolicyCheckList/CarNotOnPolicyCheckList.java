package com.example.GalvanizeCapstone.carNotOnPolicyCheckList;

import com.example.GalvanizeCapstone.claims.Claim;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table( name = "car_not_on_policy_check_list")
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

    @OneToOne
    @JoinColumn
    private Claim claim;

    public CarNotOnPolicyCheckList() {}
}
