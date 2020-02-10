package com.example.GalvanizeCapstone.claims;

import com.example.GalvanizeCapstone.carNotOnPolicyCheckList.CarNotOnPolicyCheckList;
import com.example.GalvanizeCapstone.coverageCheckLists.CoverageCheckList;
import com.example.GalvanizeCapstone.employees.Employee;
import com.example.GalvanizeCapstone.members.Member;
import com.example.GalvanizeCapstone.transportationCheckLists.TransportationCheckList;
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

        @OneToOne
        @JoinColumn
        private CoverageCheckList coverageCheckLists;

        @OneToOne
        @JoinColumn
         private CarNotOnPolicyCheckList carNotOnPolicyCheckLists;

        @OneToOne
        @JoinColumn
        private TransportationCheckList transportationCheckLists;

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

    @OneToOne
    @JoinColumn
    private Employee employee;





        public Claim() {}
    }




