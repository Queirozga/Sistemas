const form = document.getElementById("formPaciente");
const inPaciente = document.getElementById("inPaciente");
const listaPacientes = document.getElementById("listaPacientes");
const emAtendimento = document.getElementById("emAtendimento");
const contadorFila = document.getElementById("contadorFila");

const pacientes = [];

form.addEventListener("submit", (e) => {
  e.preventDefault();
  const nome = inPaciente.value.trim();

  if (nome === "") return;

  pacientes.push(nome);
  atualizarFila();
  inPaciente.value = "";
});

document.getElementById("btUrgencia").addEventListener("click", () => {
  const nome = inPaciente.value.trim();

  if (nome === "") return;

  pacientes.unshift(nome); // coloca no início da fila
  atualizarFila();
  inPaciente.value = "";
});

document.getElementById("btAtender").addEventListener("click", () => {
  if (pacientes.length === 0) {
    emAtendimento.textContent = "Nenhum paciente na fila";
    return;
  }

  const atendido = pacientes.shift();
  emAtendimento.textContent = atendido;
  atualizarFila();
});

function atualizarFila() {
  listaPacientes.innerHTML = "";
  pacientes.forEach(p => {
    const li = document.createElement("li");
    li.textContent = p;
    listaPacientes.appendChild(li);
  });

  // Atualiza contador da fila
  contadorFila.textContent = pacientes.length;
}