package com.example.GalvanizeCapstone.claims;

import com.example.GalvanizeCapstone.members.Member;
import lombok.Data;

import javax.persistence.*;



    @Entity
    @Table( name = "claim")
    @Data
    public class Claim {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @ManyToOne
        @JoinColumn
        private Member member;

        @Column
        private String claimant_name;

        @Column
        private String claimant_email;

        @Column
        private String claimant_address;

        @Column
        private String claimant_phone;

        @Column
        private String occurrence_state;

        @Column
        private String claimant_auto;

        @Column
        private int research_coverage_checkList_id;

        @Column
        private int rc_reason1_id;

        @Column
        private int rc_reason2_id;

        public Claim() {}
    }




