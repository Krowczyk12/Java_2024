package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class ShapeDAO {
    private final EntityManagerFactory entityManagerFactory;

    public ShapeDAO() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("default");
    }

    public void save(Shape shape) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(shape);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public <T extends Shape> T findById(Long id, Class<T> type) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        T shape = entityManager.find(type, id);
        entityManager.close();
        return shape;
    }

    public List<Shape> findAll() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Shape> rectangles = entityManager.createQuery("SELECT r FROM Rectangle r", Shape.class).getResultList();
        List<Shape> triangles = entityManager.createQuery("SELECT t FROM Triangle t", Shape.class).getResultList();
        rectangles.addAll(triangles);
        entityManager.close();
        return rectangles;
    }

    public void delete(Long id, Class<? extends Shape> type) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Shape shape = entityManager.find(type, id);
        if (shape != null) {
            entityManager.remove(shape);
        }
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void close() {
        entityManagerFactory.close();
    }
}
