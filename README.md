📁 ghidra-devsecops-plugin/
├── .devcontainer/
│   ├── devcontainer.json
│   └── Dockerfile
├── .github/
│   └── workflows/
│       └── ghidra-ci.yml
├── extensions/
│   └── LucidExtension/
│       ├── src/
│       │   └── lucid/
│       │       └── HelloWorldScript.java
│       └── module.manifest
├── scripts/
│   └── analyze_sample.py
├── .gitignore
├── README.md
├── LICENSE

# README.md

<div align="center">
  <img src="https://lucidityconsult.net/assets/logo.svg" width="120" alt="Lucidity Logo">
  
  # Ghidra DevSecOps Plugin Environment 🚀🔍
  
  [![Dev Container Ready](https://img.shields.io/badge/devcontainer-enabled-blue?logo=visualstudiocode)](https://code.visualstudio.com/docs/remote/containers)
  [![CI Build Status](https://github.com/YOUR_USERNAME/ghidra-devsecops-plugin/actions/workflows/ghidra-ci.yml/badge.svg)](https://github.com/YOUR_USERNAME/ghidra-devsecops-plugin/actions)
</div>

---

## 🧭 Overview
This is a fully containerized development environment for building and deploying Ghidra extensions and running automated reverse engineering scripts. Built for professionals and analysts working in malware analysis, plugin development, or SRE automation.

---

## 📦 Project Structure

- `.devcontainer/` — Dev container config with Dockerfile
- `.github/workflows/` — GitHub Actions CI build for plugin validation
- `extensions/` — Ghidra plugin source code (Java)
- `scripts/` — Python automation using Ghidra's AnalyzeHeadless tool

---

## 🐳 Quick Start (DevContainer + VSCode)

```bash
# Clone this repo
git clone https://github.com/YOUR_USERNAME/ghidra-devsecops-plugin.git
cd ghidra-devsecops-plugin

# Open in VSCode (with Dev Containers extension)
code .
```

VSCode will prompt to reopen in the container. Say **Yes**, and it will automatically:
- Install required packages
- Clone + build Ghidra
- Prepare your plugin workspace

---

## 🧪 Run CI Build Manually

The GitHub Action runs on push to `main`, but you can also trigger it manually:

```bash
cd ghidra
gradle buildGhidra
```

---

## ✨ Example Output

> `HelloWorldScript.java` — when run in Ghidra:
```
Hello from Lucidity Consulting!
```

---

## 🔒 Security First

This repo is designed for isolated plugin development — no reverse engineering of malware should be done inside the container. For malware analysis, use a dedicated VM.

---

## 🤝 Contributing
We welcome contributions! Fork the repo, create your feature branch, and submit a PR.

---

## 📄 License
This project is licensed under the MIT License — see the [LICENSE](LICENSE) file for details.

<div align="center">
  <sub>Maintained with ❤️ by <strong>Lucidity Consulting LLC</strong> — Clarity in Cybersecurity.</sub>
</div>
