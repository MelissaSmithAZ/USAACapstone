package com.example.GalvanizeCapstone.members;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table( name = "members")
@Data

public class Member {
     public Member(){}

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

     @Column
    private  int member_number;

     @Column
    private  String member_name;

     @Column
    private  String phone;

    @Column
    private  String address;

    @Column
    private  int claim_id;

    @Column
    private  String email;

    @Column
    private  String base_state;

    @Column
    private  String occurrence_state;

    @Column
    private  String auto_1;

    @Column
    private  int collision_coverage;

    @Column
    private  int pd_coverage;

    @Column
    private  int bi_coverage;
    

}
