package com.example.GalvanizeCapstone.transportationCheckLists;

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
