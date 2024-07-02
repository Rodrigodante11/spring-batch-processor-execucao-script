package com.rodrigo.springbatch.processadorscript.processor;

import com.rodrigo.springbatch.processadorscript.dominio.Cliente;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcessadorScriptProcessorConfig {
    @Bean
    public ItemProcessor<Cliente, Cliente> processadorScriptProcessor() {
        // TODO: Implementar processador aqui...
        return cliente -> cliente;
    }
}
