package com.example.GalvanizeCapstone.transportationCheckLists;

import com.example.GalvanizeCapstone.claims.Claim;
import com.example.GalvanizeCapstone.coverageCheckLists.CoverageCheckList;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table( name = "TransportationCheckList")
@Data
public class TransportationCheckList {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @OneToOne
        @JoinColumn
        private CoverageCheckList coverageCheckList;

        @OneToOne
        @JoinColumn
        private Claim claim;

        @Column
        private String call;

        @Column
        private String letter;

        @Column
        private String claimant_letter;

        @Column
        private String claimant_call;

        public TransportationCheckList() {
        }
}
