package com.example.GalvanizeCapstone.policy;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



    @Column
    private  String ca_car_not_on_policy_01;

    @Column
    private  String az_car_not_on_policy_01;

    @Column
    private  String ca_car_not_on_policy_02;

    @Column
    private  String az_car_not_on_policy_02;

    @Column
    private  String ca_transportation_01;

    @Column
    private  String az_transportation_01;

    @Column
    private  String ca_transportation_02;

    @Column
    private  String az_transportation_02;

    public Policy(){}
}
