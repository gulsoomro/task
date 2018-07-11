package com.infosecurity.task.repository;

import com.infosecurity.task.model.TorIpsEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class ImplementTorIpRepository implements TorIpRepository {


    public TorIpsEntity FindByIp(String ip) {
        return null;
    }

    @Override
    public List<TorIpsEntity> findAll() {
        return null;
    }

    @Override
    public List<TorIpsEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<TorIpsEntity> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<TorIpsEntity> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(TorIpsEntity torIpsEntity) {

    }

    @Override
    public void deleteAll(Iterable<? extends TorIpsEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends TorIpsEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends TorIpsEntity> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<TorIpsEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends TorIpsEntity> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<TorIpsEntity> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public TorIpsEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends TorIpsEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends TorIpsEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends TorIpsEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends TorIpsEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TorIpsEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends TorIpsEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public TorIpsEntity findAllByIp(String ip) {
        return null;
    }
}
