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

//        onCheckList transportationCheckList;

        @Column
        private int claim_number;

        @Column
        private String claimant_name;

        @Column
        private String claimant_phone;
        @Column
        private String claimant_address;

        @Column
        private String claimant_email;

        @Column
        private String claimant_auto;

        @Column
        private String occurrence_state;

        @Column
        private int employee_id;

//        @OneToOne
//        @JoinColumn
//        private Employee employee;





        public Claim() {}
    }




