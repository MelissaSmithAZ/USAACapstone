package com.example.GalvanizeCapstone.carNotOnPolicyCheckList;

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
    private Boolean callMember;

    @Column
    private  String callDoc;


    @Column
    private Boolean rental_agreement;
//    @Column
//    private  String notes_on_rental_agreement;

    @Column
    private Boolean claimant_letter;

    @Column
    private Boolean claimant_call;

    @Column
    private String claimant_call_doc;

    @Column
    private Boolean final_letterMember;

    public CarNotOnPolicyCheckList() {}
}
