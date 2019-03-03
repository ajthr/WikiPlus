package WikiPlus.controllers;

import WikiPlus.Main;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static utils.wikipedia.search;

public class ResultListController {
    private Map<String, String> wordsAndDescriptions = new HashMap<>();
    static String key;

    @FXML private ListView<String> tempList;

    static void setSearchText(String text) {
        key = text;
    }

    static void setMenuItems(String uName) {
    }

    private String getResults(String text) {
        return "Hi This is a Test";
    }

    private void getOptions() {
//        for(int i=0; i<20;  i++) {
//            String text = "Text" + i;
//            String instantResult = "instantResult" + i;
//            wordsAndDescriptions.put(text, instantResult);
//        }

        if(wordsAndDescriptions.isEmpty()) {
            wordsAndDescriptions.put("Not Found", "The Keyword you search is not found in Wikipedia! :(");
        }
    }

    @FXML
    private void initialize() throws IOException {
        getOptions();
        for (Map.Entry<String, String> entry : wordsAndDescriptions.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String item = key + "\n" + value;
            tempList.getItems().add(item);
        }
    }

    @FXML
    private void showFullContent() throws IOException {
        String text = tempList.getSelectionModel().getSelectedItem();
        String[] keywords = text.split("\\r?\\n");
        String keyword = keywords[0];
        String result = search(key);
        ResultController.setResultText(result);
        Main.showScene("fxml/Result.fxml");
    }

    @FXML
    private void home() throws IOException {
        Main.showScene("fxml/Search.fxml");
    }
}
