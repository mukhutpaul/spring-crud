package com.bmt.webapp.repositoty;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bmt.webapp.models.Client;




public interface ClientRepository extends JpaRepository<Client,Integer> {
    
    public Client findByEmail(String email);
}
