
import java.util.UUID;

   public class Task {
        private String id;
        private String title;
        private String status;

        public Task(String title, String status) {
            this.id = UUID.randomUUID().toString();
            this.title = title;
            this.status = status;
        }

        public String getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Title: " + title + ", Status: " + status;
        }
    }

