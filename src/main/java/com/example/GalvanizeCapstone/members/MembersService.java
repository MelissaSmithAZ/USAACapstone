package com.example.GalvanizeCapstone.members;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembersService {
    @Autowired
    private final MembersRepository membersRepository;

    public MembersService(MembersRepository membersRepository) {
        this.membersRepository = membersRepository;
    }
    public List<Member> getAllMembers() {
        return this.membersRepository.findAll();
    }
    //when you put the <> it is the generic type
    public Optional<Member> getOneMember(int id) {
        return membersRepository.findById(id);
    }
    public Member addOneMember(Member newMember) {
        return membersRepository.save(newMember);
    }
    public Member updateOneMember(Member updatedMember) {
        return membersRepository.save(updatedMember);
    }
    public String removeOneMember(int id) {
        membersRepository.deleteById(id);
        return "Id " + id + " was removed";
    }



}
