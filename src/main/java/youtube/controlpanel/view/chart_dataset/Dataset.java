package youtube.controlpanel.view.chart_dataset;

import com.google.api.services.youtube.model.Video;
import org.jfree.data.category.DefaultCategoryDataset;

public interface Dataset {
    public DefaultCategoryDataset createDataset(Video video);
}
