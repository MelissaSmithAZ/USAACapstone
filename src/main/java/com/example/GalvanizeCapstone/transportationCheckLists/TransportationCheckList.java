package com.example.GalvanizeCapstone.transportationCheckLists;

import com.example.GalvanizeCapstone.claims.Claim;
import lombok.Data;

import javax.persistence.*;


@Entity
@Table( name = "TransportationCheckList")
@Data
public class TransportationCheckList {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column
        private Boolean call;

        @Column
        private String call_doc;

        @Column
        private Boolean letter;

        @Column
        private Boolean claimant_letter;

        @Column
        private Boolean claimant_call;

        @Column
        private String claimant_call_doc;

        @OneToOne
        @JoinColumn
        private Claim claim;

        public TransportationCheckList() {
        }
}
