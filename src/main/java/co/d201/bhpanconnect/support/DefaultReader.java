package co.d201.bhpanconnect.support;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.BlockingQueue;

@Slf4j
public class DefaultReader<T> implements ReadListener<T> {

    @Getter
    @Setter
    private BlockingQueue<T> objs;

    @Override
    public void invoke(T data, AnalysisContext context) {
        boolean res = objs.offer(data);
        if (res) {
            log.debug("add one record");
        } else {
            log.error("add object failed: {}", data);
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        log.info("read completed! Count: {}", objs.size());
    }
}
