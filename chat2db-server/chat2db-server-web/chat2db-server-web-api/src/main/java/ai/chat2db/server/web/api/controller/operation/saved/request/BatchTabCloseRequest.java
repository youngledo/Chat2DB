package ai.chat2db.server.web.api.controller.operation.saved.request;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * close tab
 * @author Jiaju Zhuang
 */
@Data
public class BatchTabCloseRequest {

    /**
     * primary key
     */
    @NotNull
    private List<Long> idList;

}
