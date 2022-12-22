package com.bookshelf.libraryservice.repository;

import com.bookshelf.libraryservice.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Library, String> {
}
