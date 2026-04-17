package com.imageapi.imageapi.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.imageapi.imageapi.domain.entity.Image;

public interface ImageRepository extends JpaRepository<Image, String> {
    
}
