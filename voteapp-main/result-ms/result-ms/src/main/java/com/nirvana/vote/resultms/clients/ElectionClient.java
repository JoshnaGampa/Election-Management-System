package com.nirvana.vote.resultms.clients;


import com.nirvana.vote.resultms.dto.Election;
import com.nirvana.vote.resultms.dto.ElectionWithCandidateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ELECTION-MS",url = "http://localhost:4000/election")
public interface ElectionClient {

    @GetMapping("/{election_id}")
    public Election getElectionById(@PathVariable  Long election_id);

}
