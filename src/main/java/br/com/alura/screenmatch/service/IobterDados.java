package br.com.alura.screenmatch.service;

public interface IobterDados {
    <T> T obterDados (String json, Class<T> classe);
}
