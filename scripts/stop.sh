#!/bin/bash
serviceUp = `pgrep httpd`
if [[ -n $serviceUp ]]; then
  service httpd stop
fi
