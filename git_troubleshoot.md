Analysis:
You’re hitting GitHub’s SSH authentication failure. We’ll fix it by setting up a valid SSH key, ensuring the SSH agent uses it, confirming GitHub has the matching public key, verifying remote URL, and handling network or permissions edge cases.

Steps:
1. Confirm you have access to the repo and the remote URL is correct.
2. Ensure you have an SSH key pair and that your SSH agent is running and using it.
3. Add your public key to your GitHub account.
4. Test SSH connectivity to GitHub.
5. Configure SSH client settings if needed (host, key file, port).
6. Fix file permissions for SSH keys.
7. Retry Git operation; if it still fails, gather verbose SSH logs and adjust.
8. If SSH is blocked, switch to HTTPS with a Personal Access Token.

Fix guide:

Quick checks
- Verify access: you must be a collaborator/member, and the repo must exist.
- Verify remote URL:
    - git remote -v
    - If it’s wrong, set it:
        - SSH: git remote set-url origin git@github.com:<user-or-org>/<repo>.git
        - HTTPS: git remote set-url origin https://github.com/<user-or-org>/<repo>.git

Create or locate an SSH key
- List keys: ls -al ~/.ssh
- Create an Ed25519 key (recommended):
    - ssh-keygen -t ed25519 -C "your_email@example.com"
    - Press Enter to accept default path (~/.ssh/id_ed25519); set a passphrase if you want.

Start SSH agent and add your key
- macOS/Linux:
    - eval "$(ssh-agent -s)"
    - ssh-add ~/.ssh/id_ed25519
- Windows (Git Bash/PowerShell with OpenSSH):
    - Ensure “OpenSSH Authentication Agent” service is running.
    - In shell: eval "$(ssh-agent -s)" then ssh-add ~/.ssh/id_ed25519

Add your public key to GitHub
- Copy the public key:
    - macOS: pbcopy < ~/.ssh/id_ed25519.pub
    - Linux/Windows: cat ~/.ssh/id_ed25519.pub and copy the output
- GitHub: Settings -> SSH and GPG keys -> New SSH key -> paste -> Save.

Test SSH to GitHub
- ssh -T git@github.com
- Expected on success: “Hi <user>! You’ve successfully authenticated...”
- If it fails, get verbose logs: ssh -vT git@github.com and check which key was tried and why it failed.

Optional: SSH config for convenience or special networks
- Create/edit ~/.ssh/config with one of the following:

Standard port 22:
Host github.com
HostName github.com
User git
IdentityFile ~/.ssh/id_ed25519
AddKeysToAgent yes

If port 22 is blocked (use port 443):
Host github.com
HostName ssh.github.com
User git
Port 443
IdentityFile ~/.ssh/id_ed25519
AddKeysToAgent yes

Fix permissions (critical on Unix/macOS)
- chmod 700 ~/.ssh
- chmod 600 ~/.ssh/id_ed25519
- chmod 644 ~/.ssh/id_ed25519.pub
- chmod 600 ~/.ssh/config (if present)

Retry your Git command
- git fetch OR git push
- If it still fails:
    - Ensure the correct key is loaded: ssh-add -l
    - If using multiple keys, explicitly set IdentityFile in ~/.ssh/config as shown above.
    - Re-run with logs: GIT_SSH_COMMAND="ssh -v" git fetch to see SSH details used by Git.

Alternative: use HTTPS with a Personal Access Token (PAT)
- Change remote to HTTPS:
    - git remote set-url origin https://github.com/<user-or-org>/<repo>.git
- Use your GitHub username and a PAT (with repo scope) when prompted for password.

Platform-specific notes
- Windows + WSL: keys in Windows aren’t automatically visible in WSL. Either generate keys in WSL too, or forward the Windows agent into WSL. Simpler: keep and use keys within the environment you run Git from.
- Organization repos: if you were invited, accept the invitation first; otherwise you won’t have access yet.

After completing these steps, ssh -T git@github.com should succeed and your Git operations should work.