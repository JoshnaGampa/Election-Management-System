package com.nirvana.vote.resultms.clients;

import com.nirvana.vote.resultms.dto.CandidateDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="CANDIDATE-MS",url = "http://localhost:4001/candidate")
public interface CandidateClient {

    @GetMapping("/{candidate_id}")
    public CandidateDto getCandidateById(@PathVariable Long candidate_id);

}
