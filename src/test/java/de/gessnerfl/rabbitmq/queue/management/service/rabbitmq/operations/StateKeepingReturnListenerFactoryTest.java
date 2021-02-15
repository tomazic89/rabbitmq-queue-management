package de.gessnerfl.rabbitmq.queue.management.service.rabbitmq.operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class StateKeepingReturnListenerFactoryTest {

    private StateKeepingReturnListenerFactory sut;

    @BeforeEach
    public void init(){
        sut = new StateKeepingReturnListenerFactory();
    }

    @Test
    public void shouldCreateNewInsanceOfStateKeepingReturnListener(){
        OperationId operationId = mock(OperationId.class);
        Logger logger = mock(Logger.class);

        StateKeepingReturnListener listener = sut.createFor(operationId, logger);

        assertNotNull(listener);
    }

}