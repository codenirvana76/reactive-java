package org.nirvana.reactive.example;

import reactor.core.publisher.Flux;

public class MyFirstFlux {
    public static void main(String args[]) {
        Flux myNumberFlux = Flux.just("1", "2", "3", "4");
        myNumberFlux.doOnNext( o -> System.out.println( o)).subscribe();

    }
}
