package com.example.GalvanizeCapstone.claims;

import lombok.Data;

import javax.persistence.*;

public class Claim {
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

        @ManyToOne
        @JoinColumn
        private Member member;

        @Column
        private  String claimant_name;

        @Column
        private  String claimant_email;

        @Column
        private  String claimant_address;

        @Column
        private  String claimant_phone;

        @Column
        private  String base_state;

        @Column
        private  String occurrence_state;

        @Column
        private  String claimant_auto;

        @Column
        private  int collision_coverage;

        @Column
        private  int pd_coverage;

        @Column
        private  int bi_coverage;

        @Column
        private  int research_coverage_checkList_id;

        @Column
        private  int rc_reason1_id;

        @Column
        private  int rc_reason2_id;













    }
