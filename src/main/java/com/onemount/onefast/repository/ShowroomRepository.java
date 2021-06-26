package com.onemount.onefast.repository;

import java.util.List;

import com.onemount.onefast.model.Showroom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowroomRepository extends JpaRepository<Showroom, Long> {
    List<Showroom> findByCityLikeOrAddressLike(String city, String address);
}
