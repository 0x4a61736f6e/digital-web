# digital-web

[Digital](https://github.com/hneemann/Digital) von Helmut Neemann im Browser, per [CheerpJ](https://cheerpj.com).

**Live:** https://0x4a61736f6e.github.io/digital-web/

## Kurz

- Erster Start: 30–60 s Geduld.
- Speichern: Ordner `downloads` → Browser-Download.
- Öffnen: ↑ in der Titelleiste → Datei aus `uploads`.
- Alles außerhalb dieser Ordner speichert der Browser zwischen.
- Geht nicht: ghdl/iverilog, Remote-Schnittstelle.

## Lokal

```bash
cd .. && npx http-server -p 8080   # dann localhost:8080/digital-web/
cd start && javac --release 8 -cp ../Digital.jar -d classes Start.java && jar cf ../start.jar -C classes . jre8
```

## Rechtliches

- **Digital:** © Helmut Neemann, [GPL-3.0](LICENSE), unverändert gebaut aus [`d118dce`](https://github.com/hneemann/Digital/commit/d118dce).
- **In `Digital.jar`:** XStream 1.4.20 (BSD-3-Clause), MXParser 1.2.2 (Indiana University Extreme! Lab License 1.2), XmlPull 1.1.3.1 (Public Domain), SLF4J 1.7.24 (MIT), JSON-java 20220924 (Public Domain).
  *This product includes software developed by the Indiana University Extreme! Lab (http://www.extreme.indiana.edu/).*
- **`start/jre8/lib/`:** aus OpenJDK 8, © Oracle, GPL-2.0 mit Classpath Exception.
- **CheerpJ:** © Leaning Technologies, proprietär, nicht im Repo, geladen vom offiziellen CDN, [Community-Lizenz](https://cheerpj.com/licensing/) (nicht kommerziell).
- **Eigener Code** (`index.html`, `start/`): GPL-3.0.
- Inoffiziell, keine Verbindung zu Neemann oder Leaning Technologies, ohne Gewährleistung.
- **Datenschutz:** keine Cookies, kein Tracking. IP-Adresse sehen technisch bedingt [GitHub](https://docs.github.com/site-policy/privacy-policies/github-general-privacy-statement) und [Leaning Technologies](https://leaningtech.com/privacy-policy/). Schaltungen bleiben im Browser.
