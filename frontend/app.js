const { createApp, reactive } = Vue;

const App = {
  template: `
    <div class="container my-5">
      <h1 class="mb-4">Developer Aider v1.0</h1>
      <form @submit.prevent="handleSubmit">
        <!-- Command Select -->
        <div class="mb-3">
          <label for="command" class="form-label">Command</label>
          <select 
            id="command" 
            class="form-select" 
            v-model="form.command"
          >
            <option value="" disabled>Select a command</option>
            <option value="start">Start</option>
            <option value="stop">Stop</option>
            <option value="pause">Pause</option>
          </select>
        </div>

        <!-- Input Textarea -->
        <div class="mb-3">
          <label for="input" class="form-label">Input</label>
          <textarea 
            id="input" 
            class="form-control" 
            rows="4" 
            v-model="form.input"
            placeholder="Enter input here..."
          ></textarea>
        </div>

        <!-- Properties Textarea -->
        <div class="mb-3">
          <label for="properties" class="form-label">Properties</label>
          <textarea 
            id="properties" 
            class="form-control" 
            rows="4" 
            v-model="form.properties"
            placeholder="Enter properties here..."
          ></textarea>
        </div>

        <!-- Output Textarea -->
        <div class="mb-3">
          <label for="output" class="form-label">Output</label>
          <textarea 
            id="output" 
            class="form-control" 
            rows="4" 
            v-model="form.output"
            placeholder="Enter output here..."
          ></textarea>
        </div>

        <!-- Submit Button -->
        <button type="submit" class="btn btn-primary">Submit</button>
      </form>
    </div>
  `,
  setup() {
    const form = reactive({
      command: '',
      input: '',
      properties: '',
      output: '',
    });

    const handleSubmit = () => {
      console.log('Form Submitted:', form);
      alert('Form Submitted: Check the console for details.');
    };

    return {
      form,
      handleSubmit,
    };
  },
};

createApp(App).mount('#app');
