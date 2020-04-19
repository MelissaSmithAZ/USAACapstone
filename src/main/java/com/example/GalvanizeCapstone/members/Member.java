package com.example.GalvanizeCapstone.members;

import com.example.GalvanizeCapstone.policy.Policy;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table( name = "members")
@Data

public class Member {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

    @Column
    private  String member_name;
     @Column
    private  int member_number;

     @Column
    private  String phone;

    @Column
    private  String address;

    @Column
    private  String email;
    @Column
    private  String auto_1;

    @Column
    private  String base_state;

    @Column
    private  int bi_coverage;

    @Column
    private  int collision_coverage;

    @Column
    private  int pd_coverage;

    @ManyToOne
    @JoinColumn
    private Policy policy;

//    @OneToMany
//    @JoinColumn
//    private List<Claim> claims;

    public Member(){}



}
