import { useState } from "react";
import {
  TextField,
  Button,
  Card,
  CardContent,
  IconButton,
  Typography,
} from "@mui/material";
import DeleteIcon from "@mui/icons-material/Delete";

const TodoList = () => {
  const [tasks, setTasks] = useState([]);
  const [newTask, setNewTask] = useState("");

  const handleInputChange = (e) => {
    setNewTask(e.target.value);
  };

  const handleAddTask = () => {
    if (newTask.trim() !== "") {
      setTasks([...tasks, newTask]);
      setNewTask("");
    }
  };

  const handleDeleteTask = (index) => {
    const updatedTasks = tasks.filter((_, i) => i !== index);
    setTasks(updatedTasks);
  };

  return (
    <div>
      <TextField
        value={newTask}
        onChange={handleInputChange}
        label="New Task"
        variant="outlined"
        fullWidth
        margin="normal"
      />
      <Button onClick={handleAddTask} variant="contained" color="primary">
        Add Task
      </Button>
      {tasks.map((task, index) => (
        <Card key={index} variant="outlined" style={{ marginTop: "1rem" }}>
          <CardContent>
            <Typography>{task}</Typography>
            <IconButton
              onClick={() => handleDeleteTask(index)}
              aria-label="delete"
            >
              <DeleteIcon />
            </IconButton>
          </CardContent>
        </Card>
      ))}
    </div>
  );
};

export default TodoList;