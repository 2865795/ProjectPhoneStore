package org.example.repository;

import java.util.List;

public interface Reposotory<T> {
    void save(T entity);
    void saveAll(List<T> entities);
    List<T> load();
}
